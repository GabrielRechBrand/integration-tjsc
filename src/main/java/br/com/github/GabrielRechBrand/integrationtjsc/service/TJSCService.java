package br.com.github.GabrielRechBrand.integrationtjsc.service;

import br.com.github.GabrielRechBrand.integrationtjsc.tjsc.*;
import lombok.SneakyThrows;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.List;

@Service
public class TJSCService {

    @Value("${integration.tjsc.url}")
    String url;

    @Value("${integration.tjsc.usuario}")
    String user;

    @Value("${integration.tjsc.senha}")
    String password;

    @SneakyThrows
    protected SeloService_Service getSeloService() {
        return new SeloService_Service(new URL(url));
    }

    public List<TipoAto> getTiposAto() {
        return getSeloService().getSeloServicePort().getTiposDeAto();
    }

    public List<TipoAto20> getTiposAto20() {
        return getSeloService().getSeloServicePort().getTiposDeAto20();
    }

    public List<TipoDocumento> getTiposDocumento() {
        return getSeloService().getSeloServicePort().getTiposDeDocumento();
    }

    public List<TipoCobranca> getTiposCobranca() {
        return getSeloService().getSeloServicePort().getTiposDeCobranca();
    }

    public List<TipoCobranca20> getTiposCobranca20() {
        return getSeloService().getSeloServicePort().getTiposDeCobranca20();
    }

    public List<TipoEmail> getTiposEmail() {
        return getSeloService().getSeloServicePort().getTiposDeEmail();
    }

    public List<TipoEndereco> getTiposEndereco() {
        return getSeloService().getSeloServicePort().getTiposDeEndereco();
    }

    public List<TipoEndosso> getTiposEndosso() {
        return getSeloService().getSeloServicePort().getTiposDeEndosso();
    }

    public List<TipoProcuracao> getTiposProcuracao() {
        return getSeloService().getSeloServicePort().getTiposDeProcuracao();
    }

    public List<TipoRegistroAverbacao> getTiposRegistroAverbacao() {
        return getSeloService().getSeloServicePort().getTiposDeRegistroDeAverbacao();
    }

    public List<TipoSelo> getTiposSelo() {
        return getSeloService().getSeloServicePort().getTiposDeSelo();
    }

    public List<TipoSubestabelecimento> getTiposSubestabelecimento() {
        return getSeloService().getSeloServicePort().getTiposDeSubestabelecimento();
    }

    public List<TipoTestamento> getTiposTestamento() {
        return getSeloService().getSeloServicePort().getTiposDeTestamento();
    }

    public List<SituacaoTitulo> getSituacoesTitulo() {
        return getSeloService().getSeloServicePort().getSituacoesDeTitulo();
    }

    public List<TipoTelefone> getTiposTelefone() {
        return getSeloService().getSeloServicePort().getTiposDeTelefone();
    }

    public List<Profissao> getProfissoes() {
        return getSeloService().getSeloServicePort().getProfissoes();
    }

    public List<TipoServentuario> getTiposServentuario() {
        return getSeloService().getSeloServicePort().getTiposDeServentuario();
    }

    public List<MotivoProtesto> getMotivosDeProtesto() {
        return getSeloService().getSeloServicePort().getMotivosDeProtesto();
    }

    public List<MotivoCancelProtesto> getMotivoCancelamentoProtesto() {
        return getSeloService().getSeloServicePort().getMotivosDeCancelamentoDoProtesto();
    }

    public List<Moeda> getMoedas() {
        return getSeloService().getSeloServicePort().getMoedas();
    }

    public List<FormaPagamento> getFormasPagamento() {
        return getSeloService().getSeloServicePort().getFormasDePagamento();
    }

    public List<Etnia> getEtnias() {
        return getSeloService().getSeloServicePort().getEtnias();
    }

    public List<EstadoCivil> getEstadosCivis() {
        return getSeloService().getSeloServicePort().getEstadosCivis();
    }

    public List<EspecieTitulo> getEspeciesTitulo() {
        return getSeloService().getSeloServicePort().getEspeciesDeTitulo();
    }

    public List<Pais> getPaises() {
        return getSeloService().getSeloServicePort().getPaises();
    }

    public List<Estado> getEstados() {
        return getSeloService().getSeloServicePort().getEstados();
    }

    public List<Municipio> getMunicipios() {
        return getSeloService().getSeloServicePort().getMunicipios();
    }

    public List<Escolaridade> getEscolaridades() {
        return getSeloService().getSeloServicePort().getEscolaridades();
    }

    public List<Comarca> getComarcas() {
        return getSeloService().getSeloServicePort().getComarcas();
    }

    public List<ComarcaMunicipio> getComarcasMunicipios() {
        return getSeloService().getSeloServicePort().getComarcasMunicipios();
    }

    public List<Banco> getBancos() {
        return getSeloService().getSeloServicePort().getBancos();
    }

    @SneakyThrows
    public byte[] getSelosPedido(Long numeroPedido, Boolean isento) {
        return getSeloService().getSeloServicePort().getSelosPedido(user, password, numeroPedido, isento);
    }

    @SneakyThrows
    public byte[] getSelosPedidoCompactados(Long numeroPedido, Boolean isento) {
        return getSeloService().getSeloServicePort().getSelosPedidoCompactados(user, password, numeroPedido, isento);
    }

    @SneakyThrows
    public byte[] getSelos() {
        return getSeloService().getSeloServicePort().getSelos(user, password);
    }

    @SneakyThrows
    public byte[] getSelosCompactados() {
        return getSeloService().getSeloServicePort().getSelosCompactados(user, password);
    }

    @SneakyThrows
    @Cacheable(value = "getEntesDeclaradosUtilidadePublicaEstadual")
    public List<EnteDeclaradoUtilidadePublicaEstadual> getEntesDeclaradosUtilidadePublicaEstadual() {
        return getSeloService().getSeloServicePort().getEntesDeclaradosUtilidadePublicaEstadual();
    }

    @SneakyThrows
    public List<CartorioLivro> getCartorioLivros() {
        return getSeloService().getSeloServicePort().getCartorioLivros(user, password);
    }

    @SneakyThrows
    public List<CartorioLivro20> getCartorioLivros20() {
        return getSeloService().getSeloServicePort().getCartorioLivros20(user, password);
    }

    @SneakyThrows
    public List<CartorioServentuario> getCartorioSeventuarios() {
        return getSeloService().getSeloServicePort().getCartorioServentuarios(user, password);
    }

    @SneakyThrows
    public List<CartorioLivro20> getCartorioSeventuarios20() {
        return getSeloService().getSeloServicePort().getCartorioLivros20(user, password);
    }

    @SneakyThrows
    public List<JuizPaz> getJuizesPaz() {
        return getSeloService().getSeloServicePort().getJuizesDePaz(user, password);
    }

    @SneakyThrows
    public List<JuizPaz20> getJuizesPaz20() {
        return getSeloService().getSeloServicePort().getJuizesDePaz20(user, password);
    }

}

