<template>
    <div>
        <wj-flex-grid
            ref="flexGridDetails"
            :key="value.length"
            :autoGenerateColumns="false"
            :allowAddNew="false"
            :allowDelete="true"
            :allowPinning="'SingleColumn'"
            :newRowAtTop="false"
            :showMarquee="true"
            :selectionMode="'MultiRange'"
            :validateEdits="false"
            :itemsSource="value"
            :initialized="flexDetailsInitialized"
            style="margin-top:10px; max-height:65vh;"
        >
            <wj-flex-grid-cell-template cellType="RowHeader" v-slot="cell">{{cell.row.index + 1}}</wj-flex-grid-cell-template>
        </wj-flex-grid>

        <CompanyId v-if="editMode"
            :offline="offline"
            :isNew="!itemToEdit"
            :editMode="editMode"
            inList
            v-model="itemToEdit"
            @add="append"
        >
            <slot name="actions"></slot>
        </CompanyId>
        <v-btn v-if="editMode" @click="append()">추가</v-btn>
    </div>
</template>

<script>
import BaseDetailGrid from '../base-ui/BaseDetailGrid';
import CompanyId from '../CompanyId.vue';

export default {
    name: 'CompanyIdsDetailGrid',
    mixins: [BaseDetailGrid],
    components: [
        CompanyId
    ],
    methods: {
    }
}
</script>

