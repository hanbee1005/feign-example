# Feign Client 적용 예제 프로젝트
Feign 은 Netflix 에서 개발된 Http client binder 입니다. 

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
   - springCloudVersion 의 경우 spring boot 버전에 맞는 버전을 사용을 하셔야 합니다.
   - https://spring.io/projects/spring-cloud 로 이동하셔서 사용하시는 spring boot 버전에 맞는 버전을 사용해주세요.
2. 

### 참고
- [우아한 형제들 블로그](https://techblog.woowahan.com/2630/)
- [Netflix Feign Github](https://github.com/Netflix/feign)
- [OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)