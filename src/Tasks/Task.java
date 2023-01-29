package Tasks;

public class Task<T> extends BaseTask<T> {

    public Task(T id, String creation, String deadLine, String creator, String description, priorityEnum priority) {
        super(id, creation, deadLine, creator, description, priority);
    }

    @Override
    public void showInfo() {
        System.out.printf("""
                        ID задачи:  \t%s
                        Дата создания: \t%s
                        Дедлайн:    \t%s
                        Создан кем: \t%s
                        Описание:   \t%s
                        Приоритет:  \t%s
                        %n""",
                id,
                creationDate,
                deadLine,
                author,
                description,
                priority
        );
    }


    @Override
    public void importData() {

    }
}
