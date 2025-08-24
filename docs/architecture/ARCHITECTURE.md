# Math App - Architecture Documentation

## 1. Project Overview

The Math App is a comprehensive learning platform consisting of three main components: a backend API for data management and authentication, a React-based dashboard for user interaction, and a marketing landing page. The entire system is deployed on AWS using modern containerization and infrastructure-as-code practices.

## 2. Project Structure

```
math-app/
├── backend/                    # Java Spring Boot 3 API
│   ├── src/main/java/
│   ├── src/main/resources/
│   ├── src/test/
│   ├── pom.xml
│   └── target/
├── frontend/                   # React Dashboard Application
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── vite.config.js
├── landingpage/               # React Marketing Landing Page
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── vite.config.js
├── infra/                     # AWS Infrastructure (Terraform)
│   └── terraform files
└── docs/                      # Project Documentation
    └── architecture/
```

## 3. Technology Stack

### Backend
- **Framework:** Java Spring Boot 3
- **Purpose:** REST API for CRUD operations and authentication
- **Features:**
  - User authentication and authorization
  - Data persistence and management
  - Business logic implementation
  - Security middleware

### Frontend Dashboard
- **Framework:** React with Vite
- **Purpose:** User interaction and application interface
- **Features:**
  - User dashboard
  - Math learning modules
  - Progress tracking
  - Interactive exercises

### Landing Page
- **Framework:** React with Vite
- **Purpose:** Marketing and user acquisition
- **Features:**
  - Product presentation
  - User registration
  - Marketing content
  - Call-to-action components

### Infrastructure
- **Cloud Provider:** AWS
- **Infrastructure as Code:** Terraform
- **Containerization:** Docker with ECS
- **Container Registry:** Amazon ECR
- **Networking:** VPC for production environment

## 4. System Architecture

### 4.1 High-Level Architecture

```
[Users] → [Landing Page] → [Registration/Login]
                ↓
[Users] → [Frontend Dashboard] → [Backend API] → [Database]
                ↓
[AWS Infrastructure (ECS, ECR, VPC)]
```

### 4.2 Component Interactions

1. **Landing Page → Backend API**
   - User registration
   - Initial contact forms
   - Marketing analytics

2. **Frontend Dashboard → Backend API**
   - User authentication
   - CRUD operations for math content
   - Progress tracking
   - User profile management

3. **Backend API**
   - Centralized authentication service
   - Data validation and business logic
   - Database operations
   - API endpoints for both frontend applications

## 5. Deployment Architecture

### 5.1 CI/CD Pipeline

```
GitHub Repository → GitHub Actions (CI) → AWS CodeDeploy (CD) → ECS Containers
```

**Continuous Integration (GitHub Actions):**
- Code quality checks
- Unit and integration tests
- Docker image building
- Push to Amazon ECR

**Continuous Deployment (AWS CodeDeploy):**
- Deploy to ECS clusters
- Rolling deployment strategy
- Health checks and monitoring
- Rollback capabilities

### 5.2 AWS Infrastructure

**Container Orchestration:**
- **Amazon ECS:** Container orchestration service
- **Amazon ECR:** Private container registry
- **Docker Containers:** Application packaging

**Networking:**
- **VPC (Virtual Private Cloud):** Isolated network environment for production
- **Subnets:** Public and private subnet configuration
- **Security Groups:** Network-level security rules
- **Load Balancers:** Traffic distribution and high availability

**Infrastructure Management:**
- **Terraform:** Infrastructure as Code for reproducible deployments
- **Version Control:** Infrastructure versioning and change tracking

## 6. Data Flow

### 6.1 User Authentication Flow
1. User accesses Landing Page or Frontend Dashboard
2. Authentication request sent to Backend API
3. Backend validates credentials and returns JWT token
4. Frontend stores token for subsequent API calls
5. Protected routes require valid token verification

### 6.2 Application Data Flow
1. User interacts with Frontend Dashboard
2. Frontend sends HTTP requests to Backend API
3. Backend processes requests and applies business logic
4. Database operations performed as needed
5. Backend returns JSON response to Frontend
6. Frontend updates UI with received data

## 7. Security Considerations

- **Authentication:** JWT-based authentication system
- **Authorization:** Role-based access control
- **Network Security:** VPC isolation and security groups
- **Data Protection:** HTTPS encryption for all communications
- **Container Security:** Regular image updates and vulnerability scanning

## 8. Scalability and Performance

- **Horizontal Scaling:** ECS auto-scaling based on demand
- **Load Distribution:** Application Load Balancer for traffic management
- **Container Optimization:** Lightweight Docker images
- **Caching Strategies:** Application-level caching for improved performance

## 9. Monitoring and Observability

- **Container Monitoring:** ECS CloudWatch integration
- **Application Logs:** Centralized logging for debugging
- **Health Checks:** Application and infrastructure health monitoring
- **Alerting:** Automated alerts for system issues

## 10. Development Workflow

1. **Local Development:** Each component can be developed independently
2. **Feature Branches:** Git flow for feature development
3. **Code Review:** Pull request process before merging
4. **Testing:** Automated testing in CI pipeline
5. **Deployment:** Automated deployment to production environment

## 11. Future Considerations

- **Microservices Migration:** Potential service decomposition as the application grows
- **Database Scaling:** Consider database clustering or managed services
- **CDN Integration:** Static asset delivery optimization
- **Multi-Region Deployment:** Geographic distribution for better performance
