# 🚀 Spring Boot CI/CD Deployment using GitHub Actions, Docker & AWS EC2

This project demonstrates how to automate the deployment of a Spring Boot application using **GitHub Actions**, **Docker**, **Docker Hub**, and **AWS EC2**.

---

## 📌 Tech Stack

- Java 21
- Spring Boot
- Maven
- Docker
- Docker Hub
- GitHub Actions
- AWS EC2
- Linux
- SSH

---

# 📂 Project Workflow

```text
Developer
    │
    ▼
Push Code to GitHub
    │
    ▼
GitHub Actions Triggered
    │
    ▼
Build Spring Boot JAR
    │
    ▼
Build Docker Image
    │
    ▼
Push Image to Docker Hub
    │
    ▼
Connect to AWS EC2 via SSH
    │
    ▼
Pull Latest Docker Image
    │
    ▼
Run Docker Container
    │
    ▼
Spring Boot Application Live 🚀
```

---

# 📁 Project Structure

```
.
├── .github
│   └── workflows
│       └── deploy.yml
├── src
├── Dockerfile
├── pom.xml
└── README.md
```

---

# ⚙️ Prerequisites

- Java 21
- Maven
- Docker Desktop
- Git
- AWS Account
- Docker Hub Account
- GitHub Account

---

# 🔨 Build Spring Boot Application

Build JAR file

```bash
./mvnw clean package -DskipTests
```

or

```bash
mvn clean package
```

---

# 🐳 Docker Commands

### Build Docker Image

```bash
docker build -t spring-boot-ci-demo .
```

### Check Images

```bash
docker images
```

### Run Container

```bash
docker run -d -p 8080:8080 spring-boot-ci-demo
```

### Check Running Containers

```bash
docker ps
```

### Stop Container

```bash
docker stop <container-id>
```

### Remove Container

```bash
docker rm <container-id>
```

### Remove Docker Image

```bash
docker rmi spring-boot-ci-demo
```

---

# 🐳 Docker Hub Commands

Login

```bash
docker login
```

Tag Image

```bash
docker tag spring-boot-ci-demo sagar1004/spring-boot-ci-demo:latest
```

Push Image

```bash
docker push sagar1004/spring-boot-ci-demo:latest
```

Pull Image

```bash
docker pull sagar1004/spring-boot-ci-demo:latest
```

---

# ☁️ AWS EC2 Setup

## Connect to EC2

```bash
ssh -i demo-keypair.pem ec2-user@<EC2-Public-IP>
```

---

## Update Packages

```bash
sudo yum update -y
```

---

## Install Docker

```bash
sudo yum install docker -y
```

---

## Start Docker

```bash
sudo systemctl start docker
```

---

## Enable Docker

```bash
sudo systemctl enable docker
```

---

## Add User to Docker Group

```bash
sudo usermod -aG docker ec2-user
```

Reconnect to the EC2 instance.

---

## Verify Docker

```bash
docker --version
```

```bash
docker ps
```

---

# 🚀 Deploy Application on EC2

Pull Latest Image

```bash
docker pull sagar1004/spring-boot-ci-demo:latest
```

Run Container

```bash
docker run -d \
--name spring-demo \
-p 8080:8080 \
sagar1004/spring-boot-ci-demo:latest
```

---

# 🔄 Update Deployment

Stop Old Container

```bash
docker stop spring-demo
```

Remove Old Container

```bash
docker rm spring-demo
```

Pull Latest Image

```bash
docker pull sagar1004/spring-boot-ci-demo:latest
```

Run Latest Container

```bash
docker run -d \
--name spring-demo \
-p 8080:8080 \
sagar1004/spring-boot-ci-demo:latest
```

---

# ⚙️ GitHub Secrets

Configure the following repository secrets:

| Secret Name | Description |
|-------------|-------------|
| DOCKER_USERNAME | Docker Hub Username |
| DOCKER_TOKEN | Docker Hub Access Token |
| EC2_HOST | EC2 Public IP |
| EC2_USERNAME | EC2 Username (ec2-user) |
| SSH_KEY | EC2 Private Key (.pem file content) |

---

# ▶️ GitHub Actions Pipeline

1. Checkout Source Code
2. Setup Java 21
3. Build Spring Boot JAR
4. Login to Docker Hub
5. Build Docker Image
6. Push Docker Image
7. Connect to AWS EC2 using SSH
8. Pull Latest Docker Image
9. Stop Old Container
10. Deploy New Container

---

# 🌐 Access Application

```
http://<EC2-PUBLIC-IP>:8080
```

Example

```
http://54.xxx.xxx.xxx:8080
```

---

# 📌 Repository

```
https://github.com/SagarKirtakar/spring-boot-ci-demo
```

---

# 👨‍💻 Author

**Sagar Kirtakar**

Java Full Stack Developer
