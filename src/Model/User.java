package Model;

/**
 * Classe responsável pela persistência de dados para um Usuário
 *
 */

public class User {

    /**
     * Criação de atributos da classe User
     * Os atributos room1
     */
    private Integer idUser;
    private String nameUser;
    private String room1User = null;
    private String room2User = null;
    private String coffee1User = null;
    private String coffee2User = null;


    /**
     * Construtor vazio da classe User
     */
    public User(){};

    /**
     * Construtor com todos os parâmetros da classe User
     */
    public User(Integer id, String name){
        this.idUser = id;
        this.nameUser = name;
    }

    /**
     * Método Setter do atributo idUser
     * realizando validação para valores negativos, nulos e zero.
     * @param id Integer
     */
    public void setIdUser(Integer id){
        if (id != null){
            if(id > 0){
                this.idUser = id;
            }else {
                System.out.println("Erro: ID do Usuário não poderá ser negativo ou zero!");
            }
        }else {
            System.out.println("Erro: ID do Usuário não poderá ser nulo!");
        }
    }

    /**
     * Método Getter do atributo idUser
     * @return Integer
     */
    public Integer getIdUser(){
        return this.idUser;
    }

    /**
     * Método Setter do atributo nameUser
     * realizando validação para textos vazios, somente espaços,
     * menos de 50 caracteres e valor nulo.
     * Remoção de espaços antes e depois da String pelo método trim.
     * @param name String
     */
    public void setNameUser(String name){
        if (name != null){
            name = name.trim();
            if (name.length() > 0 && name.length() <=50){
                this.nameUser = name;
            }else {
                System.out.println("Erro: Nome do Usuário deverá conter entre 1 e 50 caracteres!");
            }
        }else {
            System.out.println("Erro: Nome do usuário não pode ser nulo!");
        }
    }

    /**
     * Método Getter do atributo nomeUser
     */
    public String getNameUser(){
        return this.nameUser;
    }

    /**
     * Método Setter do atributo room1User
     * realizando validação para textos vazios, somente espaços,
     * e menos de 50 caracteres. Neste caso, a String pode ter valores nulos.
     * Remoção de espaços antes e depois da String pelo método trim.
     * @param room1 String
     */
    private void setRoom1User(String room1){
        room1 = room1.trim();
        if (room1.length() > 0 && room1.length() <= 50){
            this.room1User = room1;
        }else {
            System.out.println("Erro: Nome da Sala 1 deverá conter entre 1 e 50 caracteres!");
        }
    }

    /**
     * Método Setter do atributo room1User
     * @return String
     */
    public String getRoom1User(){
        return this.room1User;
    }

    /**
     * Método Setter do atributo room2User
     * realizando validação para textos vazios, somente espaços,
     * e menos de 50 caracteres. Neste caso, a String pode ter valores nulos.
     * Remoção de espaços antes e depois da String pelo método trim.
     * @param room2 String
     */
    private void setRoom2User(String room2){
        room2 = room2.trim();
        if (room2.length() > 0 && room2.length() <= 50){
            this.room1User = room2;
        }else {
            System.out.println("Erro: Nome da Sala 2 deverá conter entre 1 e 50 caracteres!");
        }
    }

    /**
     * Método Setter do atributo room2User
     * @return String
     */
    public String getRoom2User(){
        return this.room2User;
    }

    /**
     * Método Setter do atributo coffee1User
     * realizando validação para textos vazios, somente espaços,
     * e menos de 50 caracteres. Neste caso, a String pode ter valores nulos.
     * Remoção de espaços antes e depois da String pelo método trim.
     * @param coffee1 String
     */
    private void setCoffee1User(String coffee1){
        coffee1 = coffee1.trim();
        if (coffee1.length() > 0 && coffee1.length() <= 50){
            this.coffee1User = coffee1;
        }else {
            System.out.println("Erro: Nome do Espaço de Café 1 deverá conter entre 1 e 50 caracteres!");
        }
    }

    /**
     * Método Setter do atributo coffee1User
     * @return String
     */
    public String getCoffee1User(){
        return this.coffee1User;
    }

    /**
     * Método Setter do atributo coffee2User
     * realizando validação para textos vazios, somente espaços,
     * e menos de 50 caracteres. Neste caso, a String pode ter valores nulos.
     * Remoção de espaços antes e depois da String pelo método trim.
     * @param coffee2 String
     */
    private void setCoffee2User(String coffee2){
        coffee2 = coffee2.trim();
        if (coffee2.length() > 0 && coffee2.length() <= 50){
            this.coffee2User = coffee2;
        }else {
            System.out.println("Erro: Nome do Espaço de Café 1 deverá conter entre 1 e 50 caracteres!");
        }
    }

    /**
     * Método Setter do atributo coffee2User
     * @return String
     */
    public String getCoffee2User(){
        return this.coffee2User;
    }
}