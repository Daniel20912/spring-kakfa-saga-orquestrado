package br.com.microservices.orchestrated.orderservice.core.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "event")
// apenas Order e Event precisam estar mapeados como documentos, pois os outros objetos não terão uma collection só deles
// eles apenas farão parte do documento
public class Event {

    @Id
    private String id;
    private String transactionId;
    private String orderId;
    private Order payload;
    private String source;
    private String status;
    private List<History> eventHistory;
    private LocalDateTime createdAt;
}
