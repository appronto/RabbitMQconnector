# RabbitMQ Connector

The **RabbitMQ connector** can be used to seamlessly connect to RabbitMQ (http://rabbitmq.com). Robust messaging for applications. Open source and commercially supported.

Thanks to Rom van Arendonk for helping finish this module. Please contribute on GitHub

This module supports two patterns:

- Publish / Subscribe (one publisher, many subscribers, each message is received by all subscribers)
  
- Work queues (one publisher, many subscribers, each message is processed only once)

## Dependencies
* [RabbitMQ libraries](http://www.rabbitmq.com/java-client.html)

## Installation
* You can acquire an account at [cloudamqp.com](https://www.cloudamqp.com/ "cloudamqp.com"). They deliver hosted RabbitMQ instances and also offer a free plan too. 

* Import the module **RabbitMQ connector** in your project (by downloading and exporting the module from this project, see https://github.com/appronto/RabbitMQconnector/releases)

* You need to add the MxModelReflection module from the appstore

- Add RMQConfiguration_Overview to your navigation
- Use the provided actions in Objects/subfolder
- Do not use microflows in /private folders
- Do not use Java actions

- Optionally, you can add the provided ASU action in /Resources to your after startup actions to start listening to all listening configurations

## Configuration options
		
- Durable exchange: exchange survives reboot of the server

- Persistent messages: messages are stored on hard disk (and hence, survive a reboot of the server)

- Confirm messages: exchange must acknowledge the messages. If messages are not acknowledged, an error is thrown (and should be handled by custom logic)

- Auto delete exchange: if the server can delete the exchange when it is not in use

- Number of concurrent messages: number of messages that are delivered before old ones must be handled. Note that this does not enable concurrent processing: even if more than one message is received, they are handled sequentially.
 


## Remarks
* Avoid fetching large amounts of data as it can lead to memory issues because all the ResultRow data is being loaded into memory at once.
* Module is only available via Github.


## License
Licensed under the Apache license.

## Developers notes
* Open the RabbitMQConnector.mpr in the Mendix Modeler.
* Use *Deploy for Eclipse* option (F6) and you can then import this module as an Eclipse project to the Eclipse IDE.

# Version history
0.1 first functions for RabbitMQ implemented
