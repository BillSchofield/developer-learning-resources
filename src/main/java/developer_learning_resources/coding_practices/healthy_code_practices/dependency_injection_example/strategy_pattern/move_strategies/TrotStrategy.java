package developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.move_strategies;


import developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.animal.MoveStrategy;

public class TrotStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.print("trots");
    }
}
