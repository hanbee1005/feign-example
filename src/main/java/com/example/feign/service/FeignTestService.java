package com.example.feign.service;

import com.example.feign.dto.Contributor;
import com.example.feign.service.github.GithubFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FeignTestService {
    private final GithubFeignClient githubFeignClient;

    public List<Contributor> getContributor(String owner, String repo) {
        return githubFeignClient.getContributor(owner, repo);
    }
}
