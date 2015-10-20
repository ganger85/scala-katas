import org.ganger.microkata.MicroKata7;
import org.ganger.microkata.MicroKata8;
import org.ganger.microkata.Person;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by arincon on 29/09/15.
 */
public class MicroKataTest {
    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("hola", "soy", "una", "secuencia");
        List<String> expected = asList("HOLA", "SOY", "UNA", "SECUENCIA");
        assertThat(MicroKata7.toUpperCase(collection)).hasSameElementsAs(expected);
        assertThat(MicroKata8.toUpperCase(collection)).hasSameElementsAs(expected);
    }

    @Test
    public void filterShouldReturnWordsWithLessThan3chars() {
        List<String> collection = asList("hola", "soy", "una", "secuencia");
        List<String> expected = asList("soy", "una");
        assertThat(MicroKata7.lessThan(collection, 4)).hasSameElementsAs(expected);
        assertThat(MicroKata8.lessThan(collection, 4)).hasSameElementsAs(expected);
    }

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(MicroKata7.flat(collection)).hasSameElementsAs(expected);
        assertThat(MicroKata8.flat(collection)).hasSameElementsAs(expected);
    }
    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertThat(MicroKata7.getOldestPerson(collection)).isEqualToComparingFieldByField(eva);
        assertThat(MicroKata8.getOldestPerson(collection)).isEqualToComparingFieldByField(eva);
    }

    @Test
    public void sumShouldReturnTheListElementsSum() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(MicroKata7.sum(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
        assertThat(MicroKata8.sum(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);

    }

    @Test
    public void getKidNameShouldReturnNamesOfAllKidsFromNorway() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        assertThat(MicroKata7.getKidNames(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
        assertThat(MicroKata8.getKidNames(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }


}

