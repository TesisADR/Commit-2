package domainapp.modules.simple.types.afiliado;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.jdo.annotations.Column;

import org.apache.isis.applib.annotation.Parameter;
import org.apache.isis.applib.annotation.ParameterLayout;
import org.apache.isis.applib.annotation.Property;

@Column(length = Name.MAX_LEN, allowsNull = "false")
@Property(maxLength = Telefono.MAX_LEN)
@Parameter(maxLength = Telefono.MAX_LEN)
@ParameterLayout(named = "Telefono")
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Telefono {

    int MAX_LEN = 40;
}