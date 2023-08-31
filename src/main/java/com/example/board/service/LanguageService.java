package com.example.board.service;

import com.example.board.entity.Language;
import com.example.board.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    // 저장
    public void insert(Language language) {

        languageRepository.save(language);
    }

    // 게시글 전체 가져오기
    public List<Language> languageList() {

        return languageRepository.findAll();
    }

    // 특정 게시글 가져오기
    public Language languageDetail(Integer language_id) {

        return languageRepository.findById(language_id).get();
    }

    public void  languageDelete(Integer language_id) {

        languageRepository.deleteById(language_id);
    }
}
