package devandroid.aragao.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.aragao.applistacurso.model.Curso;

public class CursoController {

    public List listCursos;

    public List getlistaDeCursos(){

        listCursos = new ArrayList<Curso>();
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());

        return listCursos;

    }
}
