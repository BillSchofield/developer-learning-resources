package net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.move_strategies;

import net.billschofield.oop_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.animal.MoveStrategy;

public class SlinkStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.print("slinks");
    }
}
