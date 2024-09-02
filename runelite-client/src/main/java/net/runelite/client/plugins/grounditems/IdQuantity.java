package net.runelite.client.plugins.grounditems;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class IdQuantity
{

	int id;
	int quantity;

	IdQuantity(GroundItem groundItem)
	{
		this(groundItem.getItemId(), groundItem.getQuantity());
	}

}
