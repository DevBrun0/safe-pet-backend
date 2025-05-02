package org.trainning.safepetbackend.api.adotante;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.trainning.safepetbackend.api.adotante.request.AtualizarAdotanteRequest;
import org.trainning.safepetbackend.api.adotante.request.CadastrarAdotanteRequest;
import org.trainning.safepetbackend.domain.Adotante;
import org.trainning.safepetbackend.mapper.AdotanteMapper;
import org.trainning.safepetbackend.service.AdotanteService;

import java.util.List;

@RestController
@RequestMapping("/adotante")
public class AdotanteApi {

    private final AdotanteService adotanteService;
    private AdotanteMapper adotanteMapper;

    public AdotanteApi(AdotanteService adotanteService){
        this.adotanteService = adotanteService;
    }

    @PostMapping
    public ResponseEntity<?> cadastraAdotante(CadastrarAdotanteRequest cadastrarAdotanteRequest){
        Adotante criaAdotante = adotanteService.cadastrarAdotante(cadastrarAdotanteRequest);

        if(criaAdotante != null){
            return ResponseEntity.ok(HttpStatus.OK);
        }else return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Não foi possível criar um adotante.");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletaAdotantePorId(@PathVariable String id){
        Adotante adotante = adotanteService.deletaAdotantePorId(id);

        if(adotante != null){
            return ResponseEntity.ok(HttpStatus.OK);
        }else return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Não foi possível criar um adotante.");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarAdotantePorId(@PathVariable String id){
        Adotante adotanteId = adotanteService.buscarAdotantePorId(id);
        return ResponseEntity.ok(adotanteId);
    }

    @GetMapping
    public List<Adotante> buscarTodosAdotante(){
        return adotanteService.buscarTodosAdotante();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> atualizarAdotantePorId(@RequestBody @Valid AtualizarAdotanteRequest atualizarAdotanteRequest) {

        Adotante adt = AdotanteMapper.atualizarAdotanteEspecifico(atualizarAdotanteRequest);
        adotanteService.atualizarAdotanteEspecifico(adt);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
