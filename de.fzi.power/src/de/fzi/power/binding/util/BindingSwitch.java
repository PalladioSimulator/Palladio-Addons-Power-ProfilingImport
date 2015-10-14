/**
 */
package de.fzi.power.binding.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.fzi.power.binding.BindingPackage;
import de.fzi.power.binding.DistributionPowerBinding;
import de.fzi.power.binding.FixedFactorValue;
import de.fzi.power.binding.PowerBinding;
import de.fzi.power.binding.PowerBindingRepository;
import de.fzi.power.binding.ResourcePowerBinding;
import de.fzi.power.util.Entity;
import de.fzi.power.util.NamedElement;
import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.fzi.power.binding.BindingPackage
 * @generated
 */
public class BindingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static BindingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BindingSwitch() {
		if (modelPackage == null) {
			modelPackage = BindingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BindingPackage.FIXED_FACTOR_VALUE: {
			FixedFactorValue fixedFactorValue = (FixedFactorValue) theEObject;
			T result = caseFixedFactorValue(fixedFactorValue);
			if (result == null)
				result = caseIdentifier(fixedFactorValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BindingPackage.POWER_BINDING_REPOSITORY: {
			PowerBindingRepository powerBindingRepository = (PowerBindingRepository) theEObject;
			T result = casePowerBindingRepository(powerBindingRepository);
			if (result == null)
				result = caseIdentifier(powerBindingRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BindingPackage.POWER_BINDING: {
			PowerBinding powerBinding = (PowerBinding) theEObject;
			T result = casePowerBinding(powerBinding);
			if (result == null)
				result = caseEntity(powerBinding);
			if (result == null)
				result = caseIdentifier(powerBinding);
			if (result == null)
				result = caseNamedElement(powerBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BindingPackage.RESOURCE_POWER_BINDING: {
			ResourcePowerBinding resourcePowerBinding = (ResourcePowerBinding) theEObject;
			T result = caseResourcePowerBinding(resourcePowerBinding);
			if (result == null)
				result = casePowerBinding(resourcePowerBinding);
			if (result == null)
				result = caseEntity(resourcePowerBinding);
			if (result == null)
				result = caseIdentifier(resourcePowerBinding);
			if (result == null)
				result = caseNamedElement(resourcePowerBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BindingPackage.DISTRIBUTION_POWER_BINDING: {
			DistributionPowerBinding distributionPowerBinding = (DistributionPowerBinding) theEObject;
			T result = caseDistributionPowerBinding(distributionPowerBinding);
			if (result == null)
				result = casePowerBinding(distributionPowerBinding);
			if (result == null)
				result = caseEntity(distributionPowerBinding);
			if (result == null)
				result = caseIdentifier(distributionPowerBinding);
			if (result == null)
				result = caseNamedElement(distributionPowerBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Factor Value</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Factor Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedFactorValue(FixedFactorValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Binding Repository</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Binding Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerBindingRepository(PowerBindingRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Binding</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerBinding(PowerBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Power Binding</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Power Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePowerBinding(ResourcePowerBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution Power Binding</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution Power Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributionPowerBinding(DistributionPowerBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // BindingSwitch
