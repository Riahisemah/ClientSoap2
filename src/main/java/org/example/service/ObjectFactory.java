
package org.example.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetHist_QNAME = new QName("http://Service.example.org/", "getHist");
    private final static QName _Verser_QNAME = new QName("http://Service.example.org/", "verser");
    private final static QName _SetHistoriqueResponse_QNAME = new QName("http://Service.example.org/", "setHistoriqueResponse");
    private final static QName _Exist_QNAME = new QName("http://Service.example.org/", "exist");
    private final static QName _GetActe_QNAME = new QName("http://Service.example.org/", "getActe");
    private final static QName _RetirerResponse_QNAME = new QName("http://Service.example.org/", "retirerResponse");
    private final static QName _VerserResponse_QNAME = new QName("http://Service.example.org/", "verserResponse");
    private final static QName _SetHistorique_QNAME = new QName("http://Service.example.org/", "setHistorique");
    private final static QName _Transfert_QNAME = new QName("http://Service.example.org/", "transfert");
    private final static QName _GetComptes_QNAME = new QName("http://Service.example.org/", "getComptes");
    private final static QName _TransfertResponse_QNAME = new QName("http://Service.example.org/", "transfertResponse");
    private final static QName _GetComptesResponse_QNAME = new QName("http://Service.example.org/", "getComptesResponse");
    private final static QName _ExistResponse_QNAME = new QName("http://Service.example.org/", "existResponse");
    private final static QName _SaveCompte_QNAME = new QName("http://Service.example.org/", "saveCompte");
    private final static QName _GetCompte_QNAME = new QName("http://Service.example.org/", "getCompte");
    private final static QName _GetActeResponse_QNAME = new QName("http://Service.example.org/", "getActeResponse");
    private final static QName _GetCompteResponse_QNAME = new QName("http://Service.example.org/", "getCompteResponse");
    private final static QName _Retirer_QNAME = new QName("http://Service.example.org/", "retirer");
    private final static QName _GetHistResponse_QNAME = new QName("http://Service.example.org/", "getHistResponse");
    private final static QName _SaveCompteResponse_QNAME = new QName("http://Service.example.org/", "saveCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetActeResponse }
     * 
     */
    public GetActeResponse createGetActeResponse() {
        return new GetActeResponse();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link Retirer }
     * 
     */
    public Retirer createRetirer() {
        return new Retirer();
    }

    /**
     * Create an instance of {@link GetHistResponse }
     * 
     */
    public GetHistResponse createGetHistResponse() {
        return new GetHistResponse();
    }

    /**
     * Create an instance of {@link SaveCompteResponse }
     * 
     */
    public SaveCompteResponse createSaveCompteResponse() {
        return new SaveCompteResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link TransfertResponse }
     * 
     */
    public TransfertResponse createTransfertResponse() {
        return new TransfertResponse();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link ExistResponse }
     * 
     */
    public ExistResponse createExistResponse() {
        return new ExistResponse();
    }

    /**
     * Create an instance of {@link SaveCompte }
     * 
     */
    public SaveCompte createSaveCompte() {
        return new SaveCompte();
    }

    /**
     * Create an instance of {@link Exist }
     * 
     */
    public Exist createExist() {
        return new Exist();
    }

    /**
     * Create an instance of {@link GetActe }
     * 
     */
    public GetActe createGetActe() {
        return new GetActe();
    }

    /**
     * Create an instance of {@link RetirerResponse }
     * 
     */
    public RetirerResponse createRetirerResponse() {
        return new RetirerResponse();
    }

    /**
     * Create an instance of {@link VerserResponse }
     * 
     */
    public VerserResponse createVerserResponse() {
        return new VerserResponse();
    }

    /**
     * Create an instance of {@link SetHistorique }
     * 
     */
    public SetHistorique createSetHistorique() {
        return new SetHistorique();
    }

    /**
     * Create an instance of {@link Transfert }
     * 
     */
    public Transfert createTransfert() {
        return new Transfert();
    }

    /**
     * Create an instance of {@link GetHist }
     * 
     */
    public GetHist createGetHist() {
        return new GetHist();
    }

    /**
     * Create an instance of {@link Verser }
     * 
     */
    public Verser createVerser() {
        return new Verser();
    }

    /**
     * Create an instance of {@link SetHistoriqueResponse }
     * 
     */
    public SetHistoriqueResponse createSetHistoriqueResponse() {
        return new SetHistoriqueResponse();
    }

    /**
     * Create an instance of {@link Historique }
     * 
     */
    public Historique createHistorique() {
        return new Historique();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "getHist")
    public JAXBElement<GetHist> createGetHist(GetHist value) {
        return new JAXBElement<GetHist>(_GetHist_QNAME, GetHist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "verser")
    public JAXBElement<Verser> createVerser(Verser value) {
        return new JAXBElement<Verser>(_Verser_QNAME, Verser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHistoriqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "setHistoriqueResponse")
    public JAXBElement<SetHistoriqueResponse> createSetHistoriqueResponse(SetHistoriqueResponse value) {
        return new JAXBElement<SetHistoriqueResponse>(_SetHistoriqueResponse_QNAME, SetHistoriqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "exist")
    public JAXBElement<Exist> createExist(Exist value) {
        return new JAXBElement<Exist>(_Exist_QNAME, Exist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "getActe")
    public JAXBElement<GetActe> createGetActe(GetActe value) {
        return new JAXBElement<GetActe>(_GetActe_QNAME, GetActe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "retirerResponse")
    public JAXBElement<RetirerResponse> createRetirerResponse(RetirerResponse value) {
        return new JAXBElement<RetirerResponse>(_RetirerResponse_QNAME, RetirerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "verserResponse")
    public JAXBElement<VerserResponse> createVerserResponse(VerserResponse value) {
        return new JAXBElement<VerserResponse>(_VerserResponse_QNAME, VerserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHistorique }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "setHistorique")
    public JAXBElement<SetHistorique> createSetHistorique(SetHistorique value) {
        return new JAXBElement<SetHistorique>(_SetHistorique_QNAME, SetHistorique.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transfert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "transfert")
    public JAXBElement<Transfert> createTransfert(Transfert value) {
        return new JAXBElement<Transfert>(_Transfert_QNAME, Transfert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransfertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "transfertResponse")
    public JAXBElement<TransfertResponse> createTransfertResponse(TransfertResponse value) {
        return new JAXBElement<TransfertResponse>(_TransfertResponse_QNAME, TransfertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "existResponse")
    public JAXBElement<ExistResponse> createExistResponse(ExistResponse value) {
        return new JAXBElement<ExistResponse>(_ExistResponse_QNAME, ExistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "saveCompte")
    public JAXBElement<SaveCompte> createSaveCompte(SaveCompte value) {
        return new JAXBElement<SaveCompte>(_SaveCompte_QNAME, SaveCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "getActeResponse")
    public JAXBElement<GetActeResponse> createGetActeResponse(GetActeResponse value) {
        return new JAXBElement<GetActeResponse>(_GetActeResponse_QNAME, GetActeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retirer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "retirer")
    public JAXBElement<Retirer> createRetirer(Retirer value) {
        return new JAXBElement<Retirer>(_Retirer_QNAME, Retirer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "getHistResponse")
    public JAXBElement<GetHistResponse> createGetHistResponse(GetHistResponse value) {
        return new JAXBElement<GetHistResponse>(_GetHistResponse_QNAME, GetHistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.example.org/", name = "saveCompteResponse")
    public JAXBElement<SaveCompteResponse> createSaveCompteResponse(SaveCompteResponse value) {
        return new JAXBElement<SaveCompteResponse>(_SaveCompteResponse_QNAME, SaveCompteResponse.class, null, value);
    }

}
