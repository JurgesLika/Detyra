public class User {
    private String name;
    private String lastname;
    private int age;
    private String login;
    private String password;
    public User(){
    }

    public String getName() {
        return name;
    }
    public void setName(String name,Velidator<String> nameValidator){
        if(nameValidator.velidate(name)){
            this.name=name;
        }else{
            System.out.println("Invalid name");
        }
    }
    public String getLastname(){
        return lastname;
    }

    public void setLastName(String lastname,Velidator<String> lastNameValidator) {
        if(lastNameValidator.velidate(lastname)){
            this.lastname=lastname;
        }else {
            System.out.println("Invalid lastname");
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age, Velidator<Integer> ageValidator) {
        if (ageValidator.velidate(age)) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login, Velidator<String> loginValidator) {
        if (loginValidator.velidate(login)) {
            this.login = login;
        } else {
            System.out.println("Invalid login");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Velidator<String> passwordValidator) {
        if (passwordValidator.velidate(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid password");
        }
    }
}
