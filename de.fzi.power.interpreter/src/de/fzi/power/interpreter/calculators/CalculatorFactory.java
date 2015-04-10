package de.fzi.power.interpreter.calculators;

import de.fzi.power.infrastructure.PowerConsumingResource;
import de.fzi.power.infrastructure.PowerProvidingEntity;
import de.fzi.power.specification.PowerModelSpecification;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Calculator objects.
 */
public interface CalculatorFactory {

    /**
     * Checks if is compatible with.
     *
     * @param specification the specification
     * @return true, if is compatible with
     */
    public abstract boolean isCompatibleWith(PowerModelSpecification specification);

    /**
     * Gets the priority.
     *
     * @return the priority
     */
    public abstract int getPriority();

    /**
     * Instantiate distribution power model calculator.
     *
     * @param forEntity the for entity
     * @return the abstract distribution power model calculator
     */
    public abstract AbstractDistributionPowerModelCalculator instantiateDistributionPowerModelCalculator(
            PowerProvidingEntity forEntity);

    /**
     * Instantiate resource power model calculator.
     *
     * @param forResource the for resource
     * @return the abstract resource power model calculator
     */
    public abstract AbstractResourcePowerModelCalculator instantiateResourcePowerModelCalculator(
            PowerConsumingResource forResource);

}