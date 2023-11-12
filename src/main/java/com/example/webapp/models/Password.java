package com.example.webapp.models;

public class Password  {
    private int id;
    private String title;
    private String site;
    private String login;
    private String password;

    public Password(int id, String title, String site, String login, String password) {
        this.id = id;
        this.title = title;
        this.site = site;
        this.login = login;
        this.password = password;
    }

    public Password(String title, String site, String login, String password) {
        this.title = title;
        this.site = site;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSite() {
        return this.site;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Password)) return false;
        final Password other = (Password) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$site = this.getSite();
        final Object other$site = other.getSite();
        if (this$site == null ? other$site != null : !this$site.equals(other$site)) return false;
        final Object this$login = this.getLogin();
        final Object other$login = other.getLogin();
        if (this$login == null ? other$login != null : !this$login.equals(other$login)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Password;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $site = this.getSite();
        result = result * PRIME + ($site == null ? 43 : $site.hashCode());
        final Object $login = this.getLogin();
        result = result * PRIME + ($login == null ? 43 : $login.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        return result;
    }

    public String toString() {
        return "Password(id=" + this.getId() + ", title=" + this.getTitle() + ", site=" + this.getSite() + ", login=" + this.getLogin() + ", password=" + this.getPassword() + ")";
    }
}

