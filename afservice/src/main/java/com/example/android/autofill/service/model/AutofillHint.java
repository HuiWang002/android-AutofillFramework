/*
 * Copyright (C) 2018 The Android Open Source Project
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

package com.example.android.autofill.service.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.support.annotation.NonNull;

@Entity(primaryKeys = {"autofillHint"}, foreignKeys = @ForeignKey(
        entity = FieldType.class, parentColumns = "typeName", childColumns = "fieldTypeName",
        onDelete = ForeignKey.CASCADE))
public class AutofillHint {

    @NonNull
    @ColumnInfo(name = "autofillHint")
    public String mAutofillHint;

    @NonNull
    @ColumnInfo(name = "fieldTypeName")
    public String mFieldTypeName;

    public AutofillHint(@NonNull String autofillHint, @NonNull String fieldTypeName) {
        this.mAutofillHint = autofillHint;
        this.mFieldTypeName = fieldTypeName;
    }
}
