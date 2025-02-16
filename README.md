# Enterprise Data Mesh (Open Source)

This repository contains an **enterprise-grade Data Mesh** implementation using **100% open-source tools**, deployed via Docker.

## 📌 Features:
✅ **Real-Time Data Streaming** (Kafka)  
✅ **Batch & Stream Processing** (Flink, Spark)  
✅ **Storage & Query Engine** (Iceberg, Trino)  
✅ **Data Governance** (OpenMetadata, Apache Ranger)  
✅ **API for Data Products** (Hasura GraphQL, PostgREST)  
✅ **Monitoring & Logging** (Prometheus, Grafana)  

## 🚀 Quick Start

1. Clone this repository:  
   ```bash
   git clone https://github.com/AshokGadiparthi/enterprise-data-mesh-opensource.git
   cd enterprise-data-mesh-opensource
   ```

2. Start all services using Docker Compose:  
   ```bash
   docker-compose up -d
   ```

3. Check services:
   - **Kafka UI**: http://localhost:9092  
   - **Trino**: http://localhost:8080  
   - **OpenMetadata**: http://localhost:8585  
   - **Apache Ranger**: http://localhost:6080  
   - **Grafana**: http://localhost:3000  

## 📂 Project Structure
```
enterprise-data-mesh-opensource/
│── docker/               # Docker setup files
│── kafka/                # Kafka topics & producers
│── flink/                # Flink processing jobs
│── trino/                # SQL queries for Trino
│── iceberg/              # Iceberg tables setup
│── openmetadata/         # Metadata & governance
│── ranger/               # Access control policies
│── api/                  # GraphQL & REST API setup
│── monitoring/           # Prometheus & Grafana setup
│── README.md             # Documentation
│── docker-compose.yml    # Main deployment file
```

## 📜 License
This project is open-source and available under the MIT License.

