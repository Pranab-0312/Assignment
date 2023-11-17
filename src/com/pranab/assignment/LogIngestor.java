package com.pranab.assignment;

//LogIngestController.java

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/ingest")
class LogIngestor {

 // ... (previous code)

 @PostMapping
 public String ingestLogs(@RequestBody String logs) throws IOException {
     // Add timestamp to each log entry
     String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
     logs = "{ \"timestamp\": \"" + timestamp + "\", " + logs.substring(1);  // Assuming logs is a JSON array

     IndexRequest request = new IndexRequest("logs");
     request.source(logs, XContentType.JSON);

     IndexResponse response = elasticsearchClient.index(request);

     return "Logs ingested successfully. Index: " + response.getIndex() + ", Id: " + response.getId();
 }
}
