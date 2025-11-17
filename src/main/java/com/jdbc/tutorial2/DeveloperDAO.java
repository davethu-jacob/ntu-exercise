package com.jdbc.tutorial2;

import java.util.List;

public interface DeveloperDAO {

    public Developer getDeveloper(int developerId);

    public List<Developer> getAll();

    public int insertDeveloper(Developer developer);

    public int updateDeveloper(Developer developer);

    public int deleteDeveloper(Developer developer);

}
