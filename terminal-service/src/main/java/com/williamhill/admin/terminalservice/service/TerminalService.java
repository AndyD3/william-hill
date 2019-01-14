package com.williamhill.admin.terminalservice.service;

import com.williamhill.admin.terminalservice.persistence.Terminal;
import com.williamhill.admin.terminalservice.persistence.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class TerminalService {
    @Autowired
    private TerminalRepository terminalRepository;

    @RequestMapping("/terminals")
    public List<Terminal> retrieveAllTerminals() {
        return terminalRepository.findAll();
    }

    @RequestMapping("/terminals/{id}")
    public Terminal retrieveTerminal(@PathVariable UUID uid) {
        Optional<Terminal> terminal = terminalRepository.findById(uid);

        if (!terminal.isPresent())
            throw new TerminalNotFoundException("id-" + uid);

        return terminal.get();
    }

    @PostMapping("/terminals")
    public ResponseEntity<Object> createTerminal(@RequestBody Terminal terminal) {
        Terminal savedTerminal = terminalRepository.save(terminal);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedTerminal.getUID()).toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping("/terminals/{id}")
    public ResponseEntity<Object> updateTerminal(@RequestBody Terminal terminal, @PathVariable UUID id) {

        Optional<Terminal> terminalOptional = terminalRepository.findById(id);

        if (!terminalOptional.isPresent())
            return ResponseEntity.notFound().build();

        terminal.setUID(id);

        terminalRepository.save(terminal);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/terminals/{id}")
    public void deleteTerminal(@PathVariable UUID id) {
        terminalRepository.deleteById(id);
    }

}
