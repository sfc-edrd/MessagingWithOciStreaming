package local.learning.lab.oci.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class QueryEvent
{
    @Autowired
    private KafkaTemplate<Object, Object> template;

    public <T> void getEvent(String topic, T data)
    {
        template.send(topic, data);
    }
}
