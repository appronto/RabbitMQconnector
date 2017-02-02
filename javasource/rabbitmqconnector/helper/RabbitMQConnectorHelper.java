package rabbitmqconnector.helper;

import com.rabbitmq.client.ConnectionFactory;
import rabbitmqconnector.proxies.RMQConfiguration;

public class RabbitMQConnectorHelper {
	public static ConnectionFactory createConnectionFactory(RMQConfiguration configuration) {
		ConnectionFactory factory = new ConnectionFactory();
	    factory.setHost(configuration.getHostName());
		if (configuration.getPort() != null) factory.setPort(configuration.getPort());
		String virtualHost = configuration.getVirtualHost();
		if (virtualHost != null) factory.setVirtualHost(virtualHost);
		String username = configuration.getUsername();
		if (username != null) factory.setUsername(username);
		String password = configuration.getPassword();
		if (password != null) factory.setPassword(password);
		return factory;
	}
}
