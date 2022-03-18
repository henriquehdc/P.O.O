import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MainCollection {
    
    public static void main(String[] args) {
        
        Set<Integer> inteiros = new TreeSet<>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(1);
        System.out.println(Arrays.toString(Arrays.asList(inteiros).toArray()));

        List<Integer> linteiros = new ArrayList<>();
        linteiros.add(1);
        linteiros.add(2);
        linteiros.add(3);
        linteiros.add(1);
        System.out.println(Arrays.toString(Arrays.asList(linteiros).toArray()));

        Set<Aluno> salunos = new HashSet<>();
        salunos.add(new Aluno (10,"Dezmini"));
        salunos.add(new Aluno (1,"Ummini"));
        salunos.add(new Aluno (1,null));
        System.out.println(Arrays.toString(Arrays.asList(salunos).toArray()));

        Map<Integer,Aluno> mapa = new HashMap<>();
        mapa.put((10), new Aluno(10, "Dezmini"));
        mapa.put((1), new Aluno(1, "Ummini"));
        mapa.put(13, null);
        mapa.forEach((k,v) -> System.out.println(k+ "-->" +v));
    }
}
