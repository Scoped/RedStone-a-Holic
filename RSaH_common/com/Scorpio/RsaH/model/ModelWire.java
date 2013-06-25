// Date: 6/3/2013 9:46:41 AM
// Java generated by Techne
// - ZeuX

package com.Scorpio.RsaH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWire extends ModelBase
{
  //fields
    ModelRenderer Bottom;
    ModelRenderer Top;
  
  public ModelWire()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Bottom = new ModelRenderer(this, 0, 0);
      Bottom.addBox(-8F, 0F, -8F, 16, 1, 16);
      Bottom.setRotationPoint(0F, 23F, 0F);
      Bottom.setTextureSize(64, 32);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 0);
      Top.addBox(-8F, 0F, -8F, 16, 1, 16);
      Top.setRotationPoint(0F, 22F, 0F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Bottom.render(f5);
    Top.render(f5);
  }
  
  public void renderModel(float f5)
  {
	Bottom.render(f5);
	Top.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
	  
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  
  }

}