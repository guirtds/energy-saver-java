package br.com.fiap.global.controller;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assistente")
public class AssistenteController {

    @Autowired
    private OpenAiChatClient chatClient;

    @GetMapping("/informacoes")
    public String chatAssistente(@RequestParam(value = "message",
            defaultValue = "Qual o melhor método para se economizar energia no dia a dia?") String message) {
        return chatClient.call(message);
    }
}
