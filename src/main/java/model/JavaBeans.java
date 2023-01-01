package model;

/**
 * The type Java beans.
 */
public class JavaBeans {

    private String idcon;
    private String nome;
    private String fone;
    private String email;

    /**
     * Instantiates a new Java beans.
     */
    public JavaBeans() {
        super();
    }

    /**
     * Instantiates a new Java beans.
     *
     * @param idcon the idcon
     * @param nome  the nome
     * @param fone  the fone
     * @param email the email
     */
    public JavaBeans(String idcon, String nome, String fone, String email) {
        super();
        this.idcon = idcon;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    /**
     * Gets idcon.
     *
     * @return the idcon
     */
    public String getIdcon() {
        return idcon;
    }

    /**
     * Sets idcon.
     *
     * @param idcon the idcon
     */
    public void setIdcon(String idcon) {
        this.idcon = idcon;
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets fone.
     *
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * Sets fone.
     *
     * @param fone the fone
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

