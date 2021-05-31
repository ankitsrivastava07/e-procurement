package user.translator;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ObjectTranslator {

	private ModelMapper mapper = new ModelMapper();

	public <D> D translate(Object source, Class<D> destinationType) {
		return mapper.map(source, destinationType);
	}
}
