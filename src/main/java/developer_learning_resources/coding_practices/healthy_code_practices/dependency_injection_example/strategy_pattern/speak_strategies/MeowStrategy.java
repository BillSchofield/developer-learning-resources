package developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.speak_strategies;

import developer_learning_resources.coding_practices.healthy_code_practices.dependency_injection_example.strategy_pattern.animal.SpeakStrategy;

public class MeowStrategy implements SpeakStrategy {
    @Override
    public void speak() {
        System.out.print("meow");
    }
}
