package devandroid.aragao.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.aragao.applistacurso.model.Curso;

public class CursoController {

    private List listCursos;

    public List getlistaDeCursos(){

        listCursos = new ArrayList<Curso>();
        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("HTML"));
        listCursos.add(new Curso("C#"));
        listCursos.add(new Curso("Python"));
        listCursos.add(new Curso("PHP"));
        listCursos.add(new Curso("Java EE"));
        listCursos.add(new Curso("Flutter"));
        listCursos.add(new Curso("Dart"));

        return listCursos;

    }
}
