package connector;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.connect.connector.Task;
import org.apache.kafka.connect.sink.SinkConnector;

import java.util.List;
import java.util.Map;

public class TestSinkConnector extends SinkConnector {
    @Override
    public String version() {
        return null;
    }

    @Override
    public List<Map<String, String>> taskConfigs(int maxTasks) {
        return null;
    }

    @Override
    public ConfigDef config() {
        return null;
    }

    @Override
    public Class<? extends Task> taskClass() {
        return null;
    }

    @Override
    public void start(Map<String, String> props) {

    }

    @Override
    public void stop() {

    }
}
