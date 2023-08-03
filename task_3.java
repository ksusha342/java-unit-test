@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age; // Инициализируй поля класса в конструкторе
    this.result = result;
  }

  @Parameterized.Parameters(name = "age {0}, expected {1}") // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
		{17, true}, // Заполни массив тестовыми данными и ожидаемым результатом
        {18, true},
        {21, true},
        {22, true},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Used age " + age + ". Expected: " + result + ", actual: " + isAdult, result, isAdult);
	}
}
