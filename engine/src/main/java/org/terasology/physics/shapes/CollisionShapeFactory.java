/*
 * Copyright 2017 MovingBlocks
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
package org.terasology.physics.shapes;

import org.terasology.math.geom.Vector3f;

import java.util.List;

/**
 * Factory interface to create new collision shapes.
 */
public interface CollisionShapeFactory {
    /**
     * Creates a new box shape with the given extents.
     * @param extents The full extents of the box shape.
     * @return The box shape.
     */
    BoxShape getNewBox(Vector3f extents);

    /**
     * Creates a new convex hull shape with the given vertices.
     * @param vertices The vertices of the convex hull shape.
     * @return The convex hull shape.
     */
    ConvexHullShape getNewConvexHull(List<Vector3f> vertices);

    /**
     * Creates a new box shape with unit extents, that is a cube with sides of length 1.
     * @return The unit cube box shape.
     */
    default BoxShape getNewUnitCube() {
        return getNewBox(Vector3f.one());
    }

    /**
     * Creates a new empty compound shape.
     * @return The empty compound shape.
     */
    CompoundShape getNewCompoundShape();

    /**
     * Creates a new sphere shape with the given radius.
     * @param radius The radius of the shape.
     * @return The sphere shape.
     */
    SphereShape getNewSphere(float radius);
}
