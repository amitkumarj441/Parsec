# IndiaHacks-2017-Fintech
Hacking on my Blokchain [Idea](https://github.com/amitkumarj441/IndiaHacks-2017-Fintech/blob/master/IDEA.md).

## Prerequisites 

Install 
   
   - [Scala](https://www.scala-lang.org/download/)
   - [Sbt](http://www.scala-sbt.org/release/docs/Installing-sbt-on-Linux.html)
   - [Docker](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-16-04) & [Docker-compose](https://www.digitalocean.com/.../how-to-install-docker-compose-on-ubuntu-16-04)
   - [Apache Kafka](https://www.digitalocean.com/community/tutorials/how-to-install-apache-kafka-on-ubuntu-14-04)
   
## Run

To run the ParsecSimulator that will generate Parsec Protocol messages on Kafka topics, run
       
    $ sbt simulator/run
    
    
## Kafka Cluster

You can see the **schemas** as they are registered in the schema-registry-ui.

You can view the **messages** as they are shown in the kafka-topics-ui

