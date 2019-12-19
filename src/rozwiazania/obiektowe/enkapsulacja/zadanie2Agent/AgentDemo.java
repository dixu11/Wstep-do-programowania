package rozwiazania.obiektowe.enkapsulacja.zadanie2Agent;

public class AgentDemo {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Agent agent2 = new Agent();

        agent.setNarodowosc("Polak");
        agent.setTajnyDokument("Leży Jerzy na wieży i nie wierzy," +
                "że na drugiej wieży leży drugi Jerzy.");

        agent2.setNarodowosc("Rusek");
        agent2.setTajnyDokument("Перепёлка перепелят прятала от ребят");

        System.out.println(agent);
        System.out.println(agent2);

        System.out.println(agent.przekazTajnyDokument("Polak"));
        System.out.println(agent.przekazTajnyDokument("Anglik"));
        System.out.println(agent2.przekazTajnyDokument("Rusek"));
    }

}
