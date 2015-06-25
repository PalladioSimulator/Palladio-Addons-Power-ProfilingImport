/**
 */
package de.fzi.power.infrastructure;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Mounted Power Distribution Unit</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link de.fzi.power.infrastructure.MountedPowerDistributionUnit#getResourceContainer <em>
 * Resource Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fzi.power.infrastructure.InfrastructurePackage#getMountedPowerDistributionUnit()
 * @model
 * @generated
 */
public interface MountedPowerDistributionUnit extends PowerDistributionUnit {
    /**
     * Returns the value of the '<em><b>Resource Container</b></em>' reference. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Resource Container</em>' reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Resource Container</em>' reference.
     * @see #setResourceContainer(org.palladiosimulator.pcm.resourceenvironment.ResourceContainer)
     * @see de.fzi.power.infrastructure.InfrastructurePackage#getMountedPowerDistributionUnit_ResourceContainer()
     * @model required="true" ordered="false"
     * @generated
     */
    org.palladiosimulator.pcm.resourceenvironment.ResourceContainer getResourceContainer();

    /**
     * Sets the value of the '
     * {@link de.fzi.power.infrastructure.MountedPowerDistributionUnit#getResourceContainer
     * <em>Resource Container</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Resource Container</em>' reference.
     * @see #getResourceContainer()
     * @generated
     */
    void setResourceContainer(org.palladiosimulator.pcm.resourceenvironment.ResourceContainer value);

} // MountedPowerDistributionUnit
