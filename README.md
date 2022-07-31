# Feign Client 적용 예제 프로젝트
Netflix

### Guides
1. Gradle 의존성 추가
   ```
    ext {
        set('springCloudVersion', "2021.0.3")
    }
    
    dependencies {
        ...
        implementation 'org.springframework.cloud:spring-cloud-starter-openfeign'
        ...
    }
    
    dependencyManagement {
        imports {
            mavenBom "org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"
        }
    }
    ```
2. 

### 참고
- [우아한 형제들 블로그](https://techblog.woowahan.com/2630/)
- [Netflix Feign Github](https://github.com/Netflix/feign)
- [OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)