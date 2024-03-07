package re.netology.Posters;

public class Posters {
    private String[] films = new String[0];
    private int limit;

    public Posters() {
        this.limit = 5;
    }

    public Posters(int limit) {
        this.limit = limit;
    }

    public void addFilm(String movie) {
        String[] tmp = new String[films.length + 1];

        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = movie;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int result;
        if (limit < films.length) {
            result = limit;
        } else {
            result = films.length;
        }
        String[] last = new String[result];
        for (int i = 0; i < result; i++) {
            last[i] = films[films.length - 1 - i];
        }
        return last;
    }
}

