/*
 * Copyright 2013 Moving Blocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.rendering.assets.material;

import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.TObjectIntMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TObjectIntHashMap;
import org.lwjgl.opengl.GL20;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.terasology.asset.Asset;
import org.terasology.asset.AssetData;
import org.terasology.asset.AssetUri;
import org.terasology.asset.CompatibilityHackAsset;
import org.terasology.logic.manager.ShaderManager;
import org.terasology.rendering.assets.shader.ShaderParameterMetadata;
import org.terasology.rendering.assets.shader.Shader;
import org.terasology.rendering.assets.texture.Texture;
import org.terasology.rendering.opengl.OpenGLShader;

import java.nio.FloatBuffer;

/**
 * @author Immortius
 */
public interface Material extends Asset<MaterialData> {

    void setFloat(String desc, float f);

    void setFloat2(String desc, float f1, float f2);

    void setFloat3(String desc, float f1, float f2, float f3);

    void setFloat4(String desc, float f1, float f2, float f3, float f4);

    void setInt(String desc, int i);

    void setFloat1(String desc, FloatBuffer buffer);

    void setFloat2(String desc, FloatBuffer buffer);

    void setFloat3(String desc, FloatBuffer buffer);

    void setFloat4(String desc, FloatBuffer buffer);

    void setTexture(String desc, Texture texture);

}