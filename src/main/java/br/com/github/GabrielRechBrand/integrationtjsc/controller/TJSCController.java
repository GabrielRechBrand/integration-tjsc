package br.com.github.GabrielRechBrand.integrationtjsc.controller;

import br.com.github.GabrielRechBrand.integrationtjsc.dto.EnteDeclaradoDTO;
import br.com.github.GabrielRechBrand.integrationtjsc.service.TJSCService;

import br.com.github.GabrielRechBrand.integrationtjsc.service.PaginationService;
import br.com.github.GabrielRechBrand.integrationtjsc.tjsc.*;
import lombok.SneakyThrows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RequestMapping("/tjsc")
@RestController
public class TJSCController {

    @Autowired
    TJSCService tjscService;

    @SneakyThrows
    @PostMapping("/entes-declarados")
    public ResponseEntity<List<EnteDeclaradoDTO>> getEntesDeclaradosUtilidadePublicaEstadual(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<EnteDeclaradoDTO> dtoList = tjscService.getEntesDeclaradosUtilidadePublicaEstadual().stream().map(EnteDeclaradoDTO::new).toList();
        return ResponseEntity.ok(PaginationService.getFilteredPage(dtoList, pageable, filters));
    }

    @GetMapping("/tipos-email")
    public ResponseEntity<List<TipoEmail>> getTiposEmail() {
        return ResponseEntity.ok(tjscService.getTiposEmail());
    }

    @GetMapping("/tipos-documento")
    public ResponseEntity<List<TipoDocumento>> getTiposDocumento() {
        return ResponseEntity.ok(tjscService.getTiposDocumento());
    }

    @GetMapping("/tipos-endosso")
    public ResponseEntity<List<TipoEndosso>> getTiposEndosso() {
        return ResponseEntity.ok(tjscService.getTiposEndosso());
    }

    @GetMapping("/tipos-procuracao")
    public ResponseEntity<List<TipoProcuracao>> getTiposProcuracao() {
        return ResponseEntity.ok(tjscService.getTiposProcuracao());
    }

    @GetMapping("/tipos-endereco")
    public ResponseEntity<List<TipoEndereco>> getTiposEndereco() {
        return ResponseEntity.ok(tjscService.getTiposEndereco());
    }

    @GetMapping("/tipos-selo")
    public ResponseEntity<List<TipoSelo>> getTiposSelo() {
        return ResponseEntity.ok(tjscService.getTiposSelo());
    }

    @GetMapping("/tipos-subestabelecimento")
    public ResponseEntity<List<TipoSubestabelecimento>> getTiposSubestabelecimento() {
        return ResponseEntity.ok(tjscService.getTiposSubestabelecimento());
    }

    @GetMapping("/tipos-testamento")
    public ResponseEntity<List<TipoTestamento>> getTiposTestamento() {
        return ResponseEntity.ok(tjscService.getTiposTestamento());
    }

    @GetMapping("/situacoes-titulo")
    public ResponseEntity<List<SituacaoTitulo>> getSituacoesTitulo() {
        return ResponseEntity.ok(tjscService.getSituacoesTitulo());
    }

    @GetMapping("/tipos-telefone")
    public ResponseEntity<List<TipoTelefone>> getTiposTelefone() {
        return ResponseEntity.ok(tjscService.getTiposTelefone());
    }

    @GetMapping("/tipos-serventuario")
    public ResponseEntity<List<TipoServentuario>> getTiposServentuario() {
        return ResponseEntity.ok(tjscService.getTiposServentuario());
    }

    @GetMapping("/motivos-protesto")
    public ResponseEntity<List<MotivoProtesto>> getMotivosProtesto() {
        return ResponseEntity.ok(tjscService.getMotivosProtesto());
    }

    @GetMapping("/moedas")
    public ResponseEntity<List<Moeda>> getMoedas() {
        return ResponseEntity.ok(tjscService.getMoedas());
    }

    @GetMapping("/formas-pagamento")
    public ResponseEntity<List<FormaPagamento>> getFormasPagamento() {
        return ResponseEntity.ok(tjscService.getFormasPagamento());
    }

    @GetMapping("/etnias")
    public ResponseEntity<List<Etnia>> getEtnias() {
        return ResponseEntity.ok(tjscService.getEtnias());
    }

    @GetMapping("/estados-civis")
    public ResponseEntity<List<EstadoCivil>> getEstadosCivis() {
        return ResponseEntity.ok(tjscService.getEstadosCivis());
    }

    @GetMapping("/especies-titulo")
    public ResponseEntity<List<EspecieTitulo>> getEspeciesTitulo() {
        return ResponseEntity.ok(tjscService.getEspeciesTitulo());
    }

    @GetMapping("/estados")
    public ResponseEntity<List<Estado>> getEstados() {
        return ResponseEntity.ok(tjscService.getEstados());
    }

    @GetMapping("/escolaridades")
    public ResponseEntity<List<Escolaridade>> getEscolaridades() {
        return ResponseEntity.ok(tjscService.getEscolaridades());
    }

    @GetMapping("/comarcas")
    public ResponseEntity<List<Comarca>> getComarcas() {
        return ResponseEntity.ok(tjscService.getComarcas());
    }

    @GetMapping("/comarcas-municipios")
    public ResponseEntity<List<ComarcaMunicipio>> getComarcasMunicipios() {
        return ResponseEntity.ok(tjscService.getComarcasMunicipios());
    }

    @GetMapping("/bancos")
    public ResponseEntity<List<Banco>> getBancos() {
        return ResponseEntity.ok(tjscService.getBancos());
    }

    @GetMapping("/selos-pedido/{pedido}/{isento}")
    public ResponseEntity<byte[]> getSelosPedido(@PathVariable Long pedido, @PathVariable Boolean isento) {
        return ResponseEntity.ok(tjscService.getSelosPedido(pedido, isento));
    }

    @GetMapping("/selos-pedido-compactados/{pedido}/{isento}")
    public ResponseEntity<byte[]> getSelosPedidoCompactados(@PathVariable Long pedido, @PathVariable Boolean isento) {
        return ResponseEntity.ok(tjscService.getSelosPedidoCompactados(pedido, isento));
    }

    @GetMapping("/motivo-cancelamento-protesto")
    public ResponseEntity<List<MotivoCancelProtesto>> getMotivoCancelamentoProtesto() {
        return ResponseEntity.ok(tjscService.getMotivoCancelamentoProtesto());
    }

    @GetMapping("/selos")
    public ResponseEntity<byte[]> getSelos() {
        return ResponseEntity.ok(tjscService.getSelos());
    }

    @GetMapping("/selos-compactados")
    public ResponseEntity<byte[]> getSelosCompactados() {
        return ResponseEntity.ok(tjscService.getSelosCompactados());
    }

    @GetMapping("/cartorio-livros")
    public ResponseEntity<List<CartorioLivro>> getCartorioLivros() {
        return ResponseEntity.ok(tjscService.getCartorioLivros());
    }

    @GetMapping("/cartorio-livros-20")
    public ResponseEntity<List<CartorioLivro20>> getCartorioLivros20() {
        return ResponseEntity.ok(tjscService.getCartorioLivros20());
    }

    @GetMapping("/juizes-paz")
    public ResponseEntity<List<JuizPaz>> getJuizesPaz() {
        return ResponseEntity.ok(tjscService.getJuizesPaz());
    }

    @GetMapping("/juizes-paz-20")
    public ResponseEntity<List<JuizPaz20>> getJuizesPaz20() {
        return ResponseEntity.ok(tjscService.getJuizesPaz20());
    }

    @PostMapping("/municipios")
    public ResponseEntity<List<Municipio>> getMunicipios(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<Municipio> list = tjscService.getMunicipios();
        return ResponseEntity.ok(PaginationService.getFilteredPage(list, pageable, filters));
    }

    @PostMapping("/paises")
    public ResponseEntity<List<Pais>> getPaises(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<Pais> list = tjscService.getPaises();
        return ResponseEntity.ok(PaginationService.getFilteredPage(list, pageable, filters));
    }

    @PostMapping("/cartorio-serventuario")
    public ResponseEntity<List<CartorioServentuario>> getCartorioServentuarios(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<CartorioServentuario> list = tjscService.getCartorioSeventuarios();
        return ResponseEntity.ok(PaginationService.getFilteredPage(list, pageable, filters));
    }

    @PostMapping("/cartorio-serventuario-20")
    public ResponseEntity<List<CartorioServentuario20>> getCartorioServentuarios20(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<CartorioServentuario20> list = tjscService.getCartorioSeventuarios20();
        return ResponseEntity.ok(PaginationService.getFilteredPage(list, pageable, filters));
    }

    @PostMapping("/tipos-ato")
    public ResponseEntity<List<TipoAto>> getTiposAto(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<TipoAto> list = tjscService.getTiposAto();
        return ResponseEntity.ok(PaginationService.getFilteredPage(list, pageable, filters));
    }

    @PostMapping("/tipos-ato-20")
    public ResponseEntity<List<TipoAto20>> getTiposAto20(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<TipoAto20> list = tjscService.getTiposAto20();
        return ResponseEntity.ok(PaginationService.getFilteredPage(list, pageable, filters));
    }

    @PostMapping("/tipos-cobranca")
    public ResponseEntity<List<TipoCobranca>> getTiposCobranca(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<TipoCobranca> list = tjscService.getTiposCobranca();
        return ResponseEntity.ok(PaginationService.getFilteredPage(list, pageable, filters));
    }

    @PostMapping("/tipos-cobranca-20")
    public ResponseEntity<List<TipoCobranca20>> getTiposCobranca20(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<TipoCobranca20> list = tjscService.getTiposCobranca20();
        return ResponseEntity.ok(PaginationService.getFilteredPage(list, pageable, filters));
    }

    @PostMapping("/tipos-registro-averbacao")
    public ResponseEntity<List<TipoRegistroAverbacao>> getTiposRegistroAverbacao(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<TipoRegistroAverbacao> list = tjscService.getTiposRegistroAverbacao();
        return ResponseEntity.ok(PaginationService.getFilteredPage(list, pageable, filters));
    }

    @PostMapping("/profissoes")
    public ResponseEntity<List<Profissao>> getProfissoes(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<Profissao> list = tjscService.getProfissoes();
        return ResponseEntity.ok(PaginationService.getFilteredPage(list, pageable, filters));
    }

}
