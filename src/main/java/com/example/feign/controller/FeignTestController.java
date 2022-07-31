package com.example.feign.controller;

import com.example.feign.dto.Contributor;
import com.example.feign.service.FeignTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/feign")
public class FeignTestController {
    private final FeignTestService service;

    @GetMapping("/github/{owner}/{repo}")
    public List<Contributor> getGithubContributors(@PathVariable String owner, @PathVariable String repo) {
        return service.getContributor(owner, repo);
    }
}
