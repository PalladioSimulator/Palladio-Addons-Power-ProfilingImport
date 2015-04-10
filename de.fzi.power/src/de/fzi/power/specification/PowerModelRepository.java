/**
 */
package de.fzi.power.specification;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Model Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fzi.power.specification.PowerModelRepository#getPowerModelSpecifications <em>Power Model Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fzi.power.specification.SpecificationPackage#getPowerModelRepository()
 * @model
 * @generated
 */
public interface PowerModelRepository extends EObject, Identifier {
    /**
     * Returns the value of the '<em><b>Power Model Specifications</b></em>' containment reference list.
     * The list contents are of type {@link de.fzi.power.specification.PowerModelSpecification}.
     * It is bidirectional and its opposite is '{@link de.fzi.power.specification.PowerModelSpecification#getPowermodelrepository <em>Powermodelrepository</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Model Specifications</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Model Specifications</em>' containment reference list.
     * @see de.fzi.power.specification.SpecificationPackage#getPowerModelRepository_PowerModelSpecifications()
     * @see de.fzi.power.specification.PowerModelSpecification#getPowermodelrepository
     * @model opposite="powermodelrepository" containment="true"
     * @generated
     */
    EList<PowerModelSpecification> getPowerModelSpecifications();

} // PowerModelRepository