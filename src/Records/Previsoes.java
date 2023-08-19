package Records;

import java.util.List;

public class Previsoes {

    private String dt_txt;
    private List<DescricaoClima> weather;
    private Temperatura main;

    public String getDt_txt() {
        return dt_txt;
    }

    public List<DescricaoClima> getWeather() {
        return weather;
    }

    public Temperatura getMain() {
        return main;
    }

    @Override
    public String toString() {
        return "Data='" + dt_txt + '\'' +
                ", Descrição do clima=" + weather +
                ", Temperatura=" + main;
    }
}
