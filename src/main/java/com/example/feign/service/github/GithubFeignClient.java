package com.example.feign.service.github;

import com.example.feign.dto.Contributor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name = "github-client",
        url = "${external.api.github}"
)
public interface GithubFeignClient {
    @GetMapping("/{owner}/{repo}/contributors")
    List<Contributor> getContributor(@PathVariable("owner") String owner, @PathVariable("repo") String repo);
}
