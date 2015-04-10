/**
 */
package de.fzi.power.binding;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fzi.power.binding.BindingPackage
 * @generated
 */
public interface BindingFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    BindingFactory eINSTANCE = de.fzi.power.binding.impl.BindingFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Fixed Factor Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fixed Factor Value</em>'.
     * @generated
     */
    FixedFactorValue createFixedFactorValue();

    /**
     * Returns a new object of class '<em>Power Binding Repository</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Binding Repository</em>'.
     * @generated
     */
    PowerBindingRepository createPowerBindingRepository();

    /**
     * Returns a new object of class '<em>Resource Power Binding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resource Power Binding</em>'.
     * @generated
     */
    ResourcePowerBinding createResourcePowerBinding();

    /**
     * Returns a new object of class '<em>Distribution Power Binding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Distribution Power Binding</em>'.
     * @generated
     */
    DistributionPowerBinding createDistributionPowerBinding();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    BindingPackage getBindingPackage();

} //BindingFactory