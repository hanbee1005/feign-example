# Feign Client 적용 예제 프로젝트
Feign 은 Netflix 에서 개발된 Http client binder 입니다. 

### Guides
**1. Gradle 의존성 추가**
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

**2. @EnableFeignClients 추가**
   ```java
   @SpringBootApplication
   @EnableFeignClients
   public class FeignApplication {
       public static void main(String[] args) {
           SpringApplication.run(FeignApplication.class, args);
       }
   }
   ```
- @EnableFeignClients 을 사용하셔야합니다.
  - root package 에 있어야 하며, 그렇지 않은 경우 basePackages 또는 basePackageClasses 를 지정해주셔야 합니다.
- @EnableFeignClients 은 지정된 package 를 돌아다니면서 @FeignClient 를 찾아 구현체를 만들어 줍니다.

**3. Client 작성하기**
  ```java
  @FeignClient(
        name = "github-client",
        url = "${external.api.github}"
  )
  public interface GithubFeignClient {
      @GetMapping("/{owner}/{repo}/contributors")
      List<Contributor> getContributor(@PathVariable("owner") String owner, @PathVariable("repo") String repo);
  }
  ```

**4. controller, service 구현 후 API 호출**
- feign 를 하다보면, 기본으로 설정되는 bean 들이 있습니다. ***Logger, Decoder, Encoder, Contract***
- Spring 을 사용하는 환경이라면, org.springframework.cloud.openfeign.FeignClientsConfiguration 에서 어떤 Bean 이 만들어지는지 보면 됩니다.

**5. 추가 config 작성하기**

### 참고
- [우아한 형제들 블로그](https://techblog.woowahan.com/2630/)
- [Netflix Feign Github](https://github.com/Netflix/feign)
- [OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)