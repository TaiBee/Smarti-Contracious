package ua.com.kneu;

import org.junit.Test;
import ua.com.kneu.config.Factory;
import ua.com.kneu.dao.PositionDao;
import ua.com.kneu.dao.SubSectionDao;
import ua.com.kneu.entity.Position;
import ua.com.kneu.entity.SubSection;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class rTest {
    private Factory factory = Factory.getInstance();
    private PositionDao PositionRepository = factory.getPositionDao();
    private SubSectionDao SubSectionRepository = factory.getSubSectionDao();

    @Test
    public void rTest(){
        int a = 2;
        int b = 1;

        int c = a + b; //3
        assertEquals(3, c);

        //додавання Position
        Position position = new Position();
        position.setName_Position("Голова департменту");
        position.setHourly_Rate(800);
        PositionRepository.save(position);

        List<Position> positions = PositionRepository.findAll();
        assertEquals(1, PositionRepository.findAll().size());

        //додавання SubSection
        SubSection subSection = new SubSection();
        subSection.setName_SubSection("Відділ розвитку бізнесу");
        SubSectionRepository.save(subSection);

        List<SubSection> subSections = SubSectionRepository.findAll();

    }
}